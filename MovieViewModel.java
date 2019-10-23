package com.erikriosetiawan.recursivemoviesthree.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.erikriosetiawan.recursivemoviesthree.BuildConfig;
import com.erikriosetiawan.recursivemoviesthree.apiservices.MovieRepository;
import com.erikriosetiawan.recursivemoviesthree.models.MovieResult;

public class MovieViewModel extends ViewModel {

    private MutableLiveData<MovieResult> mutableLiveDataMovie;
    private MutableLiveData<Boolean> isFetching = new MutableLiveData<>();
    private static final String API_KEY = BuildConfig.API_KEY;

    public LiveData<MovieResult> getMovies() {
        return mutableLiveDataMovie;
    }

    public LiveData<Boolean> getIsFetching() {
        return isFetching;
    }

    public void setIsFetching(boolean isFetching) {
        this.isFetching.postValue(isFetching);
    }

    public void open() {
        setIsFetching(true);
        if (mutableLiveDataMovie != null) {
            return;
        }
        MovieRepository movieRepository = MovieRepository.getInstance();
        mutableLiveDataMovie = movieRepository.getMovie(API_KEY, "en-US");
    }

    public void close() {
        if (mutableLiveDataMovie.getValue() != null) {
            setIsFetching(false);
        }
    }
}
