import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {
    public static final AudioClip PADDLEBOUNCE = Applet.newAudioClip(Sound.class.getResource("paddleBounce.wav"));
    public static final AudioClip GAMEOVER = Applet.newAudioClip(Sound.class.getResource("gameover.wav"));
    public static final AudioClip BACK = Applet.newAudioClip(Sound.class.getResource("back.wav"));
    public static final AudioClip SPEEDBOUNCE = Applet.newAudioClip(Sound.class.getResource("speedShot.wav"));
    public static final AudioClip SPEEDPOW = Applet.newAudioClip(Sound.class.getResource("speedPow.wav"));
    public static final AudioClip LENPOW = Applet.newAudioClip(Sound.class.getResource("lenPow.wav"));
    public static final AudioClip SLPOW = Applet.newAudioClip(Sound.class.getResource("lenSpeed.wav"));
    public static final AudioClip WALLBOUNCE = Applet.newAudioClip(Sound.class.getResource("wallBounce.wav"));
    public static final AudioClip OUTOFBOUNDS = Applet.newAudioClip(Sound.class.getResource("outofbounds.wav"));
    public static final AudioClip NORMALSTATE = Applet.newAudioClip(Sound.class.getResource("normalState.wav"));
}

/*
    All music from the classic nes game MEGAMAN 2. Credits all belong to the developers. Special Thanks to
    Manami Matsumae for composing such wonderful soundtracks.
*/