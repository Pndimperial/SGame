package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameClass extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    //Texture img2;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		//img2 = new Texture("badlogic1.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 10, 100);
        //batch.draw(img2, 10, 10);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
        img.dispose();
        //img2.dispose();
	}
}
