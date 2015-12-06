package com.example.richardmpanga.animpossiblepuzzle;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PuzzleActivity extends AppCompatActivity {

    private PuzzleGLView puzzleGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        puzzleGLView = new PuzzleGLView(this);
        setContentView(puzzleGLView);
    }
}
