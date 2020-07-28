package com.game.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD 
{
	public static int HEALTH = 100;
	
	private Handler handler = new Handler();
	
	private int score = 0;
	private int level = 1;
	
	public void tick()
	{
		HEALTH = Game.clamp(HEALTH, 0, 100);
		
		if(HEALTH > 0)
			score++;
	}
	
	public void render(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200, 32);
		g.setColor(Color.getHSBColor((1f * HEALTH) / 360, 1f, 1f));
		g.fillRect(15, 15, HEALTH * 2, 32);
		g.setColor(Color.white);
		g.drawRect(15, 15, 200, 32);
		
		g.drawString("Score: " + score, 15, 64);
		g.drawString("Level: " + level, 15, 80);
		
		if(HEALTH <= 0)
		{
			g.drawString("Game Over ", 450, 350);
			g.drawString("Score: " + score, 450, 375);
			g.drawString("Level: " + level, 450, 400);
			handler.clearAll();
		}
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
}