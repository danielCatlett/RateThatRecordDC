package com.daniel_catlett.ratethatrecorddc;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button btnA1, btnA2, btnB1, btnB2, btnC1, btnC2;
    ImageButton imgBtnFirstSong, imgBtnSecondSong, imgBtnThirdSong;
    TextView txtFirstSong, txtSecondSong, txtThirdSong;
    MediaPlayer mpEverchanging, mpOrbit, mpClocktown;
    boolean everchangingPlaying, orbitPlaying, clocktownPlaying;
    int everchangingPosition, orbitPosition, clocktownPosition;

    int newEverchangingPosition;
    int newOrbitPosition;
    int newClocktownPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA1 = (Button)findViewById(R.id.btnA1);
        btnA2 = (Button)findViewById(R.id.btnA2);
        btnB1 = (Button)findViewById(R.id.btnB1);
        btnB2 = (Button)findViewById(R.id.btnB2);
        btnC1 = (Button)findViewById(R.id.btnC1);
        btnC2 = (Button)findViewById(R.id.btnC2);

        btnA1.setOnClickListener(bA1);
        btnA2.setOnClickListener(bA2);
        btnB1.setOnClickListener(bB1);
        btnB2.setOnClickListener(bB2);
        btnC1.setOnClickListener(bC1);
        btnC2.setOnClickListener(bC2);

        imgBtnFirstSong = (ImageButton)findViewById(R.id.imgBtnFirstSong);
        imgBtnSecondSong = (ImageButton)findViewById(R.id.imgBtnSecondSong);
        imgBtnThirdSong = (ImageButton)findViewById(R.id.imgBtnThirdSong);

        imgBtnFirstSong.setOnClickListener(ib1);
        imgBtnSecondSong.setOnClickListener(ib2);
        imgBtnThirdSong.setOnClickListener(ib3);

        txtFirstSong = (TextView)findViewById(R.id.txtFirstSong);
        txtSecondSong = (TextView)findViewById(R.id.txtSecondSong);
        txtThirdSong = (TextView)findViewById(R.id.txtThirdSong);

        txtFirstSong.setText("1. " + getString(R.string.txtEverchanging));
        txtSecondSong.setText("2. " + getString(R.string.txtOrbit));
        txtThirdSong.setText("3. " + getString(R.string.txtClocktown));

        mpEverchanging = new MediaPlayer();
        mpEverchanging = MediaPlayer.create(this, R.raw.everchanging);
        mpOrbit = new MediaPlayer();
        mpOrbit = MediaPlayer.create(this, R.raw.orbit);
        mpClocktown = new MediaPlayer();
        mpClocktown = MediaPlayer.create(this, R.raw.clocktown);

        everchangingPlaying = false;
        orbitPlaying = false;
        clocktownPlaying = false;

        everchangingPosition = 1;
        orbitPosition = 2;
        clocktownPosition = 3;

        newEverchangingPosition = 0;
        newOrbitPosition = 0;
        newClocktownPosition = 0;
    }

    //When first song button is clicked
    Button.OnClickListener ib1 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            //If Everchanging is first
            if(everchangingPosition == 1)
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpEverchanging.start();
                    everchangingPlaying = true;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    showOrHideButtons();
                }
                else if(orbitPlaying)
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    mpEverchanging.start();
                    everchangingPlaying = true;
                }
                else
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    mpEverchanging.start();
                    everchangingPlaying = true;
                }
            }
            else if(orbitPosition == 1)
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpOrbit.start();
                    orbitPlaying = true;
                    showOrHideButtons();
                }
                else if(orbitPlaying)
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    mpOrbit.start();
                    orbitPlaying = true;
                }
                else
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    mpOrbit.start();
                    orbitPlaying = true;
                }
            }
            else
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpClocktown.start();
                    clocktownPlaying = true;
                    showOrHideButtons();
                }
                else if(clocktownPlaying)
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    mpClocktown.start();
                    clocktownPlaying = true;
                }
                else
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    mpClocktown.start();
                    clocktownPlaying = true;
                }
            }
        }
    };

    //When second song button is clicked
    Button.OnClickListener ib2 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            //If Everchanging is second
            if(everchangingPosition == 2)
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpEverchanging.start();
                    everchangingPlaying = true;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    showOrHideButtons();
                }
                else if(orbitPlaying)
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    mpEverchanging.start();
                    everchangingPlaying = true;
                }
                else
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    mpEverchanging.start();
                    everchangingPlaying = true;
                }
            }
            else if(orbitPosition == 2)
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpOrbit.start();
                    orbitPlaying = true;
                    showOrHideButtons();
                }
                else if(orbitPlaying)
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    mpOrbit.start();
                    orbitPlaying = true;
                }
                else
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    mpOrbit.start();
                    orbitPlaying = true;
                }
            }
            else
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpClocktown.start();
                    clocktownPlaying = true;
                    showOrHideButtons();
                }
                else if(clocktownPlaying)
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    mpClocktown.start();
                    clocktownPlaying = true;
                }
                else
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    mpClocktown.start();
                    clocktownPlaying = true;
                }
            }
        }
    };

    //When third song button is clicked
    Button.OnClickListener ib3 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            //If Everchanging is third
            if(everchangingPosition == 3)
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpEverchanging.start();
                    everchangingPlaying = true;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    showOrHideButtons();
                }
                else if(orbitPlaying)
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    mpEverchanging.start();
                    everchangingPlaying = true;
                }
                else
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    mpEverchanging.start();
                    everchangingPlaying = true;
                }
            }
            else if(orbitPosition == 3)
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpOrbit.start();
                    orbitPlaying = true;
                    showOrHideButtons();
                }
                else if(orbitPlaying)
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    mpOrbit.start();
                    orbitPlaying = true;
                }
                else
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    mpOrbit.start();
                    orbitPlaying = true;
                }
            }
            else
            {
                //If no songs are playing
                if(!(everchangingPlaying || orbitPlaying || clocktownPlaying))
                {
                    mpClocktown.start();
                    clocktownPlaying = true;
                    showOrHideButtons();
                }
                else if(clocktownPlaying)
                {
                    mpClocktown.pause();
                    clocktownPlaying = false;
                    showOrHideButtons();
                }
                else if(everchangingPlaying)
                {
                    mpEverchanging.pause();
                    everchangingPlaying = false;
                    mpClocktown.start();
                    clocktownPlaying = true;
                }
                else
                {
                    mpOrbit.pause();
                    orbitPlaying = false;
                    mpClocktown.start();
                    clocktownPlaying = true;
                }
            }
        }
    };

    public void showOrHideButtons()
    {
        //if a song is playing
        if(everchangingPlaying || orbitPlaying || clocktownPlaying)
        {
            btnA1.setVisibility(View.INVISIBLE);
            btnA2.setVisibility(View.INVISIBLE);
            btnB1.setVisibility(View.INVISIBLE);
            btnB2.setVisibility(View.INVISIBLE);
            btnC1.setVisibility(View.INVISIBLE);
            btnC2.setVisibility(View.INVISIBLE);
        }
        else
        {
            btnA1.setVisibility(View.VISIBLE);
            btnA2.setVisibility(View.VISIBLE);
            btnB1.setVisibility(View.VISIBLE);
            btnB2.setVisibility(View.VISIBLE);
            btnC1.setVisibility(View.VISIBLE);
            btnC2.setVisibility(View.VISIBLE);
        }
    }

    Button.OnClickListener bA1 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            moveFirstSongToSecondPosition();
            moveSecondSongToFirstPosition();
            updatePositionVariables();
        }
    };
    Button.OnClickListener bA2 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            moveFirstSongToThirdPosition();
            moveThirdSongToFirstPosition();
            updatePositionVariables();
        }
    };
    Button.OnClickListener bB1 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            moveSecondSongToFirstPosition();
            moveFirstSongToSecondPosition();
            updatePositionVariables();
        }
    };
    Button.OnClickListener bB2 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            moveSecondSongToThirdPosition();
            moveThirdSongToSecondPosition();
            updatePositionVariables();
        }
    };
    Button.OnClickListener bC1 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            moveThirdSongToFirstPosition();
            moveFirstSongToThirdPosition();
            updatePositionVariables();
        }
    };
    Button.OnClickListener bC2 = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            moveThirdSongToSecondPosition();
            moveSecondSongToThirdPosition();
            updatePositionVariables();
        }
    };


    //This section is all a bunch of methods that handle the actual swapping of songs on the list
    public void moveFirstSongToSecondPosition()
    {
        if(everchangingPosition == 1)
        {
            txtSecondSong.setText("2. " + getString(R.string.txtEverchanging));
            imgBtnSecondSong.setImageResource(R.drawable.everchangingartwork);
            newEverchangingPosition = 2;
        }
        else if(orbitPosition == 1)
        {
            txtSecondSong.setText("2. " + getString(R.string.txtOrbit));
            imgBtnSecondSong.setImageResource(R.drawable.orbitartwork);
            newOrbitPosition = 2;
        }
        else
        {
            txtSecondSong.setText("2. " + getString(R.string.txtClocktown));
            imgBtnSecondSong.setImageResource(R.drawable.clocktownartwork);
            newClocktownPosition = 2;
        }
    }

    public void moveFirstSongToThirdPosition()
    {
        if(everchangingPosition == 1)
        {
            txtThirdSong.setText("3. " + getString(R.string.txtEverchanging));
            imgBtnThirdSong.setImageResource(R.drawable.everchangingartwork);
            newEverchangingPosition = 3;
        }
        else if(orbitPosition == 1)
        {
            txtThirdSong.setText("3. " + getString(R.string.txtOrbit));
            imgBtnThirdSong.setImageResource(R.drawable.orbitartwork);
            newOrbitPosition = 3;
        }
        else
        {
            txtThirdSong.setText("3. " + getString(R.string.txtClocktown));
            imgBtnThirdSong.setImageResource(R.drawable.clocktownartwork);
            newClocktownPosition = 3;
        }
    }

    public void moveSecondSongToFirstPosition()
    {
        if(everchangingPosition == 2)
        {
            txtFirstSong.setText("1. " + getString(R.string.txtEverchanging));
            imgBtnFirstSong.setImageResource(R.drawable.everchangingartwork);
            newEverchangingPosition = 1;
        }
        else if(orbitPosition == 2)
        {
            txtFirstSong.setText("1. " + getString(R.string.txtOrbit));
            imgBtnFirstSong.setImageResource(R.drawable.orbitartwork);
            newOrbitPosition = 1;
        }
        else
        {
            txtFirstSong.setText("1. " + getString(R.string.txtClocktown));
            imgBtnFirstSong.setImageResource(R.drawable.clocktownartwork);
            newClocktownPosition = 1;
        }
    }

    public void moveSecondSongToThirdPosition()
    {
        if(everchangingPosition == 2)
        {
            txtThirdSong.setText("3. " + getString(R.string.txtEverchanging));
            imgBtnThirdSong.setImageResource(R.drawable.everchangingartwork);
            newEverchangingPosition = 3;
        }
        else if(orbitPosition == 2)
        {
            txtThirdSong.setText("3. " + getString(R.string.txtOrbit));
            imgBtnThirdSong.setImageResource(R.drawable.orbitartwork);
            newOrbitPosition = 3;
        }
        else
        {
            txtThirdSong.setText("3. " + getString(R.string.txtClocktown));
            imgBtnThirdSong.setImageResource(R.drawable.clocktownartwork);
            newClocktownPosition = 3;
        }
    }

    public void moveThirdSongToFirstPosition()
    {
        if(everchangingPosition == 3)
        {
            txtFirstSong.setText("1. " + getString(R.string.txtEverchanging));
            imgBtnFirstSong.setImageResource(R.drawable.everchangingartwork);
            newEverchangingPosition = 1;
        }
        else if(orbitPosition == 3)
        {
            txtFirstSong.setText("1. " + getString(R.string.txtOrbit));
            imgBtnFirstSong.setImageResource(R.drawable.orbitartwork);
            newOrbitPosition = 1;
        }
        else
        {
            txtFirstSong.setText("1. " + getString(R.string.txtClocktown));
            imgBtnFirstSong.setImageResource(R.drawable.clocktownartwork);
            newClocktownPosition = 1;
        }
    }

    public void moveThirdSongToSecondPosition()
    {
        if(everchangingPosition == 3)
        {
            txtSecondSong.setText("2. " + getString(R.string.txtEverchanging));
            imgBtnSecondSong.setImageResource(R.drawable.everchangingartwork);
            newEverchangingPosition = 2;
        }
        else if(orbitPosition == 3)
        {
            txtSecondSong.setText("2. " + getString(R.string.txtOrbit));
            imgBtnSecondSong.setImageResource(R.drawable.orbitartwork);
            newOrbitPosition = 2;
        }
        else
        {
            txtSecondSong.setText("2. " + getString(R.string.txtClocktown));
            imgBtnSecondSong.setImageResource(R.drawable.clocktownartwork);
            newClocktownPosition = 2;
        }
    }

    //Sets position variables to value of new position variables
    public void updatePositionVariables()
    {
        //update
        if(newEverchangingPosition != 0)
            everchangingPosition = newEverchangingPosition;
        if(newOrbitPosition != 0)
            orbitPosition = newOrbitPosition;
        if(newClocktownPosition != 0)
            clocktownPosition = newClocktownPosition;

        //reset when done
        newEverchangingPosition = 0;
        newOrbitPosition = 0;
        newClocktownPosition = 0;
    }
}
