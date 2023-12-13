package pairmatching.controller

import pairmatching.model.Data

class PairMatching {
    private val data = Data()
    fun start() {
        data.readFile()
    }
}