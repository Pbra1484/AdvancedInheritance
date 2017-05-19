package inherit.controller;

import java.util.ArrayList;
import inherit.model.*;
import inherit.view.*;

public class Controller
{
	private NoisesThatAreLoud loudNoises;
	private SethMorris sethMorris;
	private Hearing hearing;
	private Sound sound;
	private Slurp slurp;
	private ArrayList<LoudNoises> noises;
	private InheritFrame baseFrame;
	
	public Controller()
	{
		loudNoises = new NoisesThatAreLoud();
		noises = new ArrayList<LoudNoises>();
		hearing = new Hearing();
		sethMorris = new SethMorris();
		sound = new Sound();
		slurp = new Slurp();
		baseFrame = new InheritFrame(this);
	}
	public void start()
	{

	}
	
	public String inheritanceTest()
	{
		String testOutput = "";
		if(new SethMorris() instanceof LoudNoises)
		{
			testOutput += "shotgun volume is " + sethMorris.shotgunBlast() + " (Seth Morris)\n";
		}
		
		if(new Hearing() instanceof LoudNoises)
		{
			testOutput += "TDuncan's clap volume is " + hearing.duncanClap() + " (Duncan Nguyen)\n";
		}
		
		if(new NoisesThatAreLoud() instanceof LoudNoises)
		{
			testOutput += "car makes " + loudNoises.carHorn() + " (Isaac Hill)\n";
		}
		
		if(new Sound() instanceof LoudNoises)
		{
			testOutput += "sound is " + sound.noiseVolume(2.0) + " (Matt Hachtel)\n";	
		}
		
		if(new Slurp() instanceof LoudNoises)
		{
			testOutput += "shotgun blast from slurp is " + slurp.shotgunBlast() + " (Patrick Brashear)";
		}
		
		return testOutput;
	}
}

