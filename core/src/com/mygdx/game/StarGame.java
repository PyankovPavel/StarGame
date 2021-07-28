package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture background;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		background = new Texture("background.jpg");


	}

	@Override
	public void render () {
		ScreenUtils.clear(0.5f, 0.5f, 0.5f, 1);
		batch.begin();
		batch.draw(background,0,0);
		batch.draw(img, 0, 0, 200,200);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
