package ru.mirea.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


class Main
{

    public static void main(String[] args) throws IOException
    {
        Settings setting = new Settings();
        setting.start();
    }
}





class LinkedPlayer implements Playable
{
    private LinkedList<Integer> deque = new LinkedList<Integer>();
    private String originalDeck;

    public LinkedPlayer(String deck)
    {
        originalDeck = deck;
    }
    public static LinkedPlayer MakeUserWithDeckReady(String deck)
    {
        LinkedPlayer player = new LinkedPlayer(deck);
        player.convertStringToDeck();
        return player;
    }
    @Override
    public void convertStringToDeck()
    {
        String[] parts = originalDeck.split(" ");
        for(int i = 0; i < 5; i++)
        {
            deque.add(Integer.parseInt(parts[i]));
        }
    }

    @Override
    public int getDeckSize()
    {
        return deque.size();
    }

    @Override
    public void addCard(int item)
    {
        deque.add(item);
    }

    @Override
    public int showCard()
    {
        return deque.peek();
    }

    @Override
    public int LoseCard()
    {
        int card = deque.peek();
        deque.remove();
        return card;
    }
}




class DequePlayer implements Playable
{
    private Deque<Integer> deque = new ArrayDeque<Integer>();
    private String originalDeck;

    public DequePlayer(String deck)
    {
        originalDeck = deck;
    }

    public static DequePlayer MakeUserWithDeckReady(String deck){
        DequePlayer player = new DequePlayer(deck);
        player.convertStringToDeck();
        return player;
    }

    @Override
    public void convertStringToDeck()
    {
        String[] parts = originalDeck.split(" ");
        for(int i = 0; i < 5; i++)
        {
            deque.add(Integer.parseInt(parts[i]));
        }
    }

    @Override
    public int getDeckSize()
    {
        return deque.size();
    }

    @Override
    public void addCard(int item)
    {
        deque.add(item);
    }

    @Override
    public int showCard()
    {
        return deque.peek();
    }

    @Override
    public int LoseCard()
    {
        int card = deque.peek();
        deque.remove();
        return card;
    }
}





class QueuePlayer implements Playable
{
    private Queue<Integer> queue = new LinkedList<Integer>();
    private String originalDeck;

    public QueuePlayer(String deck)
    {
        originalDeck = deck;
    }
    public static QueuePlayer MakeUserWithDeckReady(String deck)
    {
        QueuePlayer player = new QueuePlayer(deck);
        player.convertStringToDeck();
        return player;
    }
    public void convertStringToDeck()
    {
        String[] parts = originalDeck.split(" ");
        for(int i = 0; i < 5; i++)
        {
            queue.add(Integer.parseInt(parts[i]));
        }
    }
    public int getDeckSize()
    {
        return queue.size();
    }
    public void addCard(int item)
    {
        queue.add(item);
    }
    public int showCard()
    {
        return queue.peek();
    }
    public int LoseCard()
    {
        int card = queue.peek();
        queue.remove();
        return card;
    }

}






class Settings
{
    private Playable player1;
    private Playable player2;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public void start() throws IOException
    {
        int answer = 1;
        while(answer != 0)
        {
            System.out.println("1 - First player\n2 - Second player\n3 - Begin\n4 - Exit");
            answer = Integer.parseInt(br.readLine());
            switch (answer){
                case 1:
                    player1 = choosePlayer();
                    break;
                case 2:
                    player2 = choosePlayer();
                    break;
                case 3:
                    Game game = new Game(player1, player2);
                    game.play();
                    break;
                case 4:
                    return;
            }
        }
    }
    private Playable choosePlayer() throws IOException
    {
        System.out.println("1 - Queue\n2 - Deque\n3 - LinkedList");
        int answer2 = Integer.parseInt(br.readLine());
        if(answer2 == 1)
        {
            System.out.println("Enter 5 cards");
            String deck = br.readLine();
            return QueuePlayer.MakeUserWithDeckReady(deck);
        }
        else if(answer2 == 2)
        {
            System.out.println("Enter 5 cards");
            String deck = br.readLine();
            return DequePlayer.MakeUserWithDeckReady(deck);
        }
        else if(answer2 == 3)
        {
            System.out.println("Enter 5 cards");
            String deck = br.readLine();
            return LinkedPlayer.MakeUserWithDeckReady(deck);
        }
        else
        {
            return null;
        }
    }

}






class Game
{
    Playable p1;
    Playable p2;
    public Game(Playable p1, Playable p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void play()
    {
        int count = 0;
        while(p1.getDeckSize() != 0 && p2.getDeckSize() != 0)
        {
            count++;
            if(p1.showCard() == 0)
            {
                p1.addCard(p1.LoseCard());
                p1.addCard(p2.LoseCard());
                continue;
            }
            if(p2.showCard() == 0)
            {
                p2.addCard(p2.LoseCard());
                p2.addCard(p1.LoseCard());
                continue;
            }
            if(p1.showCard() > p2.showCard())
            {
                p1.addCard(p1.LoseCard());
                p1.addCard(p2.LoseCard());
            }
            else
            {
                p2.addCard(p2.LoseCard());
                p2.addCard(p1.LoseCard());
            }

            if(count == 106)
            {
                System.out.println("botva");
                return;
            }
        }
        if(p1.getDeckSize() == 0)
        {
            System.out.println("Second " + count);
        }
        else
        {
            System.out.println("First " + count);
        }

    }
}
