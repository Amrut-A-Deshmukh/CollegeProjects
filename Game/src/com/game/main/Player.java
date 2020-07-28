package com.game.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject
{
	Handler handler;
	
	public Player(int x, int y, ID id, Handler handler)
	{
		super(x, y, id);
		this.handler = handler;
	}

	@Override
	public void tick() 
	{
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 38);
		y = Game.clamp(y, 0, Game.HEIGHT - 61);
		
		collision();
		handler.addObject(new Trail(x, y, ID.Trail, Color.white, 32, 32, 0.06f, handler));
	}
	
	public void collision()
	{
		for(int i = 0; i < handler.object.size(); i++)
		{
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.FastEnemy)
			{
				if(getBounds().intersects(tempObject.getBounds()))
					HUD.HEALTH -= 2;
			}
		}
	}

	@Override
	public void render(Graphics g) 
	{
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

	@Override
	public Rectangle getBounds() 
	{
		return new Rectangle(x, y, 32, 32);
	}
	
}