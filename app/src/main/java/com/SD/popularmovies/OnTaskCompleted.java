package com.SD.popularmovies;

/**
 * Created by sushil dubey
 * <p/>
 * Based on http://stackoverflow.com/questions/9963691/android-asynctask-sending-callbacks-to-ui
 */
interface OnTaskCompleted {
    void onFetchMoviesTaskCompleted(Movie[] movies);
}
