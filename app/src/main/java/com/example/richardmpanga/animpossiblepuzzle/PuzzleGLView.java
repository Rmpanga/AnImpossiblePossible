package com.example.richardmpanga.animpossiblepuzzle;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/**
 * Created by richardmpanga on 12/5/15.
 */
public class PuzzleGLView extends GLSurfaceView {


    private final PuzzleRenderer puzzleRender;

    public PuzzleGLView (Context context ){
        super(context);

        // Create an OpenGL ES 2.0 context
        this.setEGLContextClientVersion(2);

        puzzleRender = new PuzzleRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        this.setRenderer(puzzleRender);

        // Render the view only when there is a change in the drawing data
        this.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){


        return true;
    }



}
