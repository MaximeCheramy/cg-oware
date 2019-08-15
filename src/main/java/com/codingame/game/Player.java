package com.codingame.game;

import com.codingame.gameengine.core.AbstractMultiplayerPlayer;
import com.codingame.gameengine.module.entities.Group;
import com.codingame.gameengine.module.entities.Text;

public class Player extends AbstractMultiplayerPlayer {
    public Group hud;
	public Text scoreText;
    
    @Override
    public int getExpectedOutputLines() {
        return 1;
    }

    public void increaseScore(int points) {
        setScore(getScore() + points);
        scoreText.setText(String.format("Score: %d", getScore()));
    }

    public Action getAction() throws TimeoutException, NumberFormatException {
        int num = Integer.parseInt(getOutputs().get(0));
        if (getIndex() == 1) {
            num += 6;
        }
        return new Action(this, num % 12);
    }
}
