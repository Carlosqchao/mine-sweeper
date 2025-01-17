package software.ulpgc.MineSweeper.arquitecture.view;

import software.ulpgc.MineSweeper.arquitecture.model.Game;

public interface BoardDisplay {

    void show(Game game);

    void on(String event, Clicked clicked);

    interface Clicked {

        void on(java.awt.Point point);
    }

    void showWin();

    void showLose();
}
