package com.wolfyscript.scaffolding

import org.jetbrains.annotations.ApiStatus.Internal

interface ScaffoldingProvider {

    companion object {
        private var instance: Scaffolding? = null

        fun get() : Scaffolding {
            return instance ?: throw IllegalStateException("ScaffoldingProvider not initialized.")
        }

        @Internal
        internal fun register(scaffolding: Scaffolding) {
            instance = scaffolding
        }

        @Internal
        internal fun unregister(scaffolding: Scaffolding) {
            instance = null
        }

    }

}