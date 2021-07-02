package com.github.imbackt.isometric

import com.badlogic.gdx.Screen
import ktx.app.KtxGame

class Game : KtxGame<Screen>() {
    override fun create() {
        addScreen(PlayScreen())
        setScreen<PlayScreen>()
    }
}