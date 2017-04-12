package inherit.model;

import inherit.model.LoudNoises;

public class Slurp implements LoudNoises
{
	double soundLevel;
	
	
	public Slurp()
	{
		soundLevel = 1000;
		
	}
	
	public double noiseVolume(double sound)
	{
		return soundLevel * sound * 99999999999999e170;
	}
	
	public double shotgunBlast()
	{
		return -1;
	}
	
	public String carHorn()
	{
		return "SLUUSUUSUSUSUSUSUSS";
	}
	
	public double dunkinClap()
	{
		return -742380045845850466803680356890632.0;
	}
}
