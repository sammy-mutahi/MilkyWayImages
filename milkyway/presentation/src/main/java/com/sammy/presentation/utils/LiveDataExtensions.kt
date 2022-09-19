package com.sammy.presentation.utils

import androidx.lifecycle.MutableLiveData

internal fun MutableLiveData<ViewState>?.inProgress() {
    this?.postValue(ViewState.IS_LOADING)
}

internal fun MutableLiveData<ViewState>?.loaded() {
    this?.postValue(ViewState.LOADED)
}

internal fun MutableLiveData<ViewState>?.error() {
    this?.postValue(ViewState.ERROR)
}
