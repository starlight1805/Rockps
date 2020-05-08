package com.example.rockpaperscissors;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private static final String SHARED_PREFS = "sharewares";
    public static final String TEXT = "text";
    TextView view1, view2, view4, view8;
    ImageView rock, paper, scissor;
    Button next,score1,score2,timer;
    public int counter=10;
    public int f=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        view1 = findViewById(R.id.textView);
        view2 = findViewById(R.id.textView3);
        rock = findViewById(R.id.imageView2);
        paper = findViewById(R.id.imageView3);
        view8 = findViewById(R.id.textView8);
        scissor = findViewById(R.id.imageView4);
        next = findViewById(R.id.button2);
        view4 = findViewById(R.id.textView4);
        score1=findViewById(R.id.button3);
        score2=findViewById(R.id.button4);
        timer=findViewById(R.id.button5);
        final String choice1 = "";
        final String choice2 = "";
        Bundle bundle = getIntent().getExtras();
        final String name1 = "" + bundle.getString("KEY");
        final String name2 = "" + bundle.getString("PUT");
        view1.setText(name1);
        view2.setText(name2);
        int rounds = Integer.parseInt(bundle.getString("ROUND"));
        String round=""+rounds;
        view8.setText(round);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String choice1 = "a";
                view8.setText(choice1);
                view1.setText(name1);
                String name22=name2+" -Turn";
                view2.setText(name22);
                rock.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "a";
                        check(choice1,choice2);
                    }
                });
                paper.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "b";
                        check(choice1,choice2);
                    }
                });
                scissor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "c";
                        check(choice1,choice2);
                    }
                });
            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String choice1 = "b";
                view1.setText(name1);
                String name22=name2+" -Turn";
                view2.setText(name22);
                rock.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "a";
                        check(choice1,choice2);
                    }
                });
                paper.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "b";
                        check(choice1,choice2);
                    }
                });
                scissor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "c";
                        check(choice1,choice2);
                    }
                });
            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String choice1 = "c";
                view1.setText(name1);
                String name22=name2+" -Turn";
                view2.setText(name22);
                rock.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "a";
                        check(choice1,choice2);
                    }
                });
                paper.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "b";
                        check(choice1,choice2);
                    }
                });
                scissor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String choice2 = "c";
                        check(choice1,choice2);
                    }
                });
            }
        });
    }
    public void check(String choice1,String choice2){
        if(choice1=="a" && choice2=="b"){
            int sc=Integer.parseInt(score2.getText().toString())+1;
            String scr=""+sc;
            score2.setText(scr);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    set();
                }
            });
        }
        if(choice1=="a" && choice2=="c"){
            int sc=Integer.parseInt(score1.getText().toString())+1;
            String scr=""+sc;
            score1.setText(scr);
            set();
        }
        if(choice1=="a" && choice2=="a"){
            int sc=Integer.parseInt(score2.getText().toString())+1;
            String scr=""+sc;
            score2.setText(scr);
            sc=Integer.parseInt(score1.getText().toString())+1;
            scr=""+sc;
            score1.setText(scr);
            set();
        }
        if(choice1=="b" && choice2=="c"){
            int sc=Integer.parseInt(score2.getText().toString())+1;
            String scr=""+sc;
            score2.setText(scr);
            set();
        }
        if(choice1=="b" && choice2=="a"){
            int sc=Integer.parseInt(score1.getText().toString())+1;
            String scr=""+sc;
            score1.setText(scr);
            set();
        }
        if(choice1=="b" && choice2=="b"){
            int sc=Integer.parseInt(score2.getText().toString())+1;
            String scr=""+sc;
            score2.setText(sc);
            sc=Integer.parseInt(score1.getText().toString())+1;
            scr=""+sc;
            score1.setText(scr);
            set();
        }
        if(choice1=="c" && choice2=="a"){
            int sc=Integer.parseInt(score2.getText().toString())+1;
            String scr=""+sc;
            score2.setText(scr);
            set();
        }
        if(choice1=="c" && choice2=="b"){
            int sc=Integer.parseInt(score1.getText().toString())+1;
            String scr=""+sc;
            score1.setText(scr);
            set();
        }
        if(choice1=="c" && choice2=="c"){
            int sc=Integer.parseInt(score2.getText().toString())+1;
            String scr=""+sc;
            score2.setText(scr);
            sc=Integer.parseInt(score1.getText().toString())+1;
            scr=""+sc;
            score1.setText(scr);
            set();
        }
    }

    public void set(){
        f++;
        final String name1=view1.getText().toString();
        final String name2=view2.getText().toString();
        String name11=name1+" -Turn";
        view1.setText(name11);
        view2.setText(name2);
        int nrounds=Integer.parseInt(view8.getText().toString());
        if(f<=nrounds){
            rock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String choice1 = "a";
                    view1.setText(name1);
                    String name22=name2+" -Turn";
                    view2.setText(name22);
                    rock.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "a";
                            check(choice1,choice2);
                        }
                    });
                    paper.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "b";
                            check(choice1,choice2);
                        }
                    });
                    scissor.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "c";
                            check(choice1,choice2);
                        }
                    });
                }
            });
            paper.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String choice1 = "b";
                    view1.setText(name1);
                    String name22=name2+" -Turn";
                    view2.setText(name22);
                    rock.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "a";
                            check(choice1,choice2);
                        }
                    });
                    paper.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "b";
                            check(choice1,choice2);
                        }
                    });
                    scissor.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "c";
                            check(choice1,choice2);
                        }
                    });
                }
            });
            scissor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String choice1 = "c";
                    view1.setText(name1);
                    String name22=name2+" -Turn";
                    view2.setText(name22);
                    rock.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "a";
                            check(choice1,choice2);
                        }
                    });
                    paper.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "b";
                            check(choice1,choice2);
                        }
                    });
                    scissor.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String choice2 = "c";
                            check(choice1,choice2);
                        }
                    });
                }
            });
        }
        if(f>nrounds){
            int score11=Integer.parseInt(score1.getText().toString());
            int score22=Integer.parseInt(score2.getText().toString());
            if(score11>score22){
                String Sname=name1+" wins";
                view1.setText(Sname);
            }
            if(score11<score22){
                String Sname=name2+"wins";
                view1.setText(Sname);
            }
            if(score11==score22){
                String Sname="Game is tied";
                view1.setText(Sname);
            }

        }

    }
}