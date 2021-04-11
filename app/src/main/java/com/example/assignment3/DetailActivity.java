package com.example.assignment3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private TextView tvTitle, tvAuthor, tvRating, tvDesc;
    private ImageView ivCover;
    private String sRating, sDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.booktitle);
        tvAuthor = findViewById(R.id.bookauthor);
        tvRating = findViewById(R.id.rating);
        tvDesc = findViewById(R.id.desc);
        ivCover = findViewById(R.id.pict);

        String sTitle = getIntent().getStringExtra("bookTitle");
        String sAuthor = getIntent().getStringExtra("bookAuthor");
        int iCover = getIntent().getIntExtra("bookCover",0);

        if(sTitle.equals("Destination Anywhere")){
            sRating = "Rating : 4.07/5";
            sDesc = "After five years at secondary school spent without any friends, Peyton King starts sixth form college determined that things will be different. Whatever happens, she will make friends at any cost.\n" +
                    "\n" +
                    "When she finds the friends she’s always dreamed of, including an actual boyfriend, she’s happier than she’s ever been.\n" +
                    "\n" +
                    "But when they let her down in the worst way, Peyton is left no better off than when she started.\n" +
                    "\n" +
                    "Now Peyton knows the only chance she has of finding happiness is to look for it somewhere else. Her life may feel small, but it doesn't have to be. With nothing but her sketchpad and a backpack, she buys a one-way ticket and gets on a plane\n";
        }else if(sTitle.equals("Starry Eyes")){
            sRating = "Rating : 4.05/5";
            sDesc = "Ever since last year’s homecoming dance, best friends-turned-best enemies Zorie and Lennon have made an art of avoiding each other. It doesn’t hurt that their families are the modern-day Californian version of the Montagues and Capulets.\n" +
                    "\n" +
                    "But when a group camping trip goes south, Zorie and Lennon find themselves stranded in the wilderness. Alone. Together.\n" +
                    "\n" +
                    "What could go wrong?\n";
        }else if(sTitle.equals("Love Letter to The Dead")){
            sRating = "Rating : 3.79/5";
            sDesc = "It begins as an assignment for English class: Write a letter to a dead person. Laurel chooses Kurt Cobain because her sister, May, loved him. And he died young, just like May did. Soon, Laurel has a notebook full of letters to people like Janis Joplin, Amy Winehouse, Amelia Earhart, Heath Ledger, and more -- though she never gives a single one of them to her teacher. She writes about starting high school, navigating new friendships, falling in love for the first time, learning to live with her splintering family. And, finally, about the abuse she suffered while May was supposed to be looking out for her. Only then, once Laurel has written down the truth about what happened to herself, can she truly begin to accept what happened to May. And only when Laurel has begun to see her sister as the person she was -- lovely and amazing and deeply flawed -- can she begin to discover her own path in this stunning debut from Ava Dellaira, Love Letters to the Dead.";
        }else if(sTitle.equals("The Book of Lost Things")){
            sRating = "Rating : 3.93/5";
            sDesc = "High in his attic bedroom, twelve-year-old David mourns the death of his mother, with only the books on his shelf for company. But those books have begun to whisper to him in the darkness. Angry and alone, he takes refuge in his imagination and soon finds that reality and fantasy have begun to meld. While his family falls apart around him, David is violently propelled into a world that is a strange reflection of his own -- populated by heroes and monsters and ruled by a faded king who keeps his secrets in a mysterious book, The Book of Lost Things.\n" +
                    "\n" +
                    "Taking readers on a vivid journey through the loss of innocence into adulthood and beyond, New York Times bestselling author John Connolly tells a dark and compelling tale that reminds us of the enduring power of stories in our lives.\n";
        }else if(sTitle.equals("Fantastic Beast: The Original Screenplay")){
            sRating = "Rating : 4.22/5";
            sDesc = "When Magizoologist Newt Scamander arrives in New York, he intends his stay to be just a brief stopover. However, when his magical case is misplaced and some of Newt's fantastic beasts escape, it spells trouble for everyone…\n" +
                    "\n" +
                    "Fantastic Beasts and Where to Find Them marks the screenwriting debut of J.K. Rowling, author of the beloved and internationally bestselling Harry Potter books. Featuring a cast of remarkable characters, this is epic, adventure-packed storytelling at its very best.\n";
        }else if(sTitle.equals("The Sullivan Sisters")){
            sRating = "Rating : 3.70/5";
            sDesc = "That painful fact of life couldn’t be truer for the Sullivan sisters. Once, they used to be close, sharing secrets inside homemade blanket castles. Now, life in the Sullivan house means closed doors and secrets left untold.\n" +
                    "\n" +
                    "Fourteen-year-old Murphy, an aspiring magician, is shocked by the death of Siegfried, her pet turtle. Seventeen-year-old Claire is bound for better things than her Oregonian hometown—until she receives a crushing rejection from her dream college. And eighteen-year-old Eileen is nursing a growing addiction in the wake of life-altering news.\n" +
                    "\n" +
                    "Then, days before Christmas, a letter arrives, informing the sisters of a dead uncle and an inheritance they knew nothing about. The news forces them to band together in the face of a sinister family mystery…and, possibly, murder.\n";
        }else if(sTitle.equals("Red Queen: Red Queen #1")){
            sRating = "Rating : 4.04/5";
            sDesc = "This is a world divided by blood—red or silver. The Reds are commoners, ruled by a Silver elite in possession of god-like superpowers. And to Mare Barrow, a seventeen-year-old Red girl from the poverty-stricken Stilts, it seems like nothing will ever change. That is until she finds herself working in the Silver Palace. Here, surrounded by the people she hates the most, Mare discovers that, despite her red blood, she possesses a deadly power of her own. One that threatens to destroy the balance of power. Fearful of Mare's potential, the Silvers hide her in plain view, declaring her a long-lost Silver princess, now engaged to a Silver prince. Despite knowing that one misstep would mean her death, Mare works silently to help the Red Guard, a militant resistance group, and bring down the Silver regime. But this is a world of betrayal and lies, and Mare has entered a dangerous dance—Reds against Silvers, prince against prince, and Mare against her own heart.";
        }else if(sTitle.equals("Glass World: Red Queen #2")){
            sRating = "Rating : 3.87/5";
            sDesc = "Mare Barrow’s blood is red—the color of common folk—but her Silver ability, the power to control lightning, has turned her into a weapon that the royal court tries to control.\n" +
                    "\n" +
                    "The crown calls her an impossibility, a fake, but as she makes her escape from Maven, the prince—the friend—who betrayed her, Mare uncovers something startling: she is not the only one of her kind.\n" +
                    "\n" +
                    "Pursued by Maven, now a vindictive king, Mare sets out to find and recruit other Red-and-Silver fighters to join in the struggle against her oppressors.\n" +
                    "\n" +
                    "But Mare finds herself on a deadly path, at risk of becoming exactly the kind of monster she is trying to defeat.\n" +
                    "\n" +
                    "Will she shatter under the weight of the lives that are the cost of rebellion? Or have treachery and betrayal hardened her forever?\n" +
                    "\n" +
                    "The electrifying next installment in the Red Queen series escalates the struggle between the growing rebel army and the blood-segregated world they’ve always known—and pits Mare against the darkness that has grown in her soul. \n";
        }else if(sTitle.equals("King's Cage: Red Queen #3")){
            sRating = "Rating : 3.98/5";
            sDesc = "In this breathless third installment to Victoria Aveyard’s bestselling Red Queen series, allegiances are tested on every side. And when the Lightning Girl's spark is gone, who will light the way for the rebellion?\n" +
                    "\n" +
                    "Mare Barrow is a prisoner, powerless without her lightning, tormented by her lethal mistakes. She lives at the mercy of a boy she once loved, a boy made of lies and betrayal. Now a king, Maven Calore continues weaving his dead mother's web in an attempt to maintain control over his country—and his prisoner.\n" +
                    "\n" +
                    "As Mare bears the weight of Silent Stone in the palace, her once-ragtag band of newbloods and Reds continue organizing, training, and expanding. They prepare for war, no longer able to linger in the shadows. And Cal, the exiled prince with his own claim on Mare's heart, will stop at nothing to bring her back.\n" +
                    "\n" +
                    "When blood turns on blood, and ability on ability, there may be no one left to put out the fire—leaving Norta as Mare knows it to burn all the way down.\n";
        }else if(sTitle.equals("War Storm: Red Queen #4")){
            sRating = "Rating : 3.88/5";
            sDesc = "Mare Barrow learned this all too well when Cal’s betrayal nearly destroyed her. Now determined to protect her heart—and secure freedom for Reds and newbloods like her—Mare resolves to overthrow the kingdom of Norta once and for all… starting with the crown on Maven’s head.\n" +
                    "\n" +
                    "But no battle is won alone, and before the Reds may rise as one, Mare must side with the boy who broke her heart in order to defeat the boy who almost broke her. Cal’s powerful Silver allies, alongside Mare and the Scarlet Guard, prove a formidable force. But Maven is driven by an obsession so deep, he will stop at nothing to have Mare as his own again, even if it means demolishing everything—and everyone—in his path.\n" +
                    "\n" +
                    "War is coming, and all Mare has fought for hangs in the balance. Will victory be enough to topple the Silver kingdoms? Or will the little lightning girl be forever silenced?\n" +
                    "\n" +
                    "In the epic conclusion to Victoria Aveyard’s stunning series, Mare must embrace her fate and summon all her power… for all will be tested, but not all will survive.\n";
        }

        Glide.with(this).load(iCover).into(ivCover);
        tvTitle.setText(sTitle);
        tvAuthor.setText(sAuthor);
        tvRating.setText(sRating);
        tvDesc.setText(sDesc);
    }
}
