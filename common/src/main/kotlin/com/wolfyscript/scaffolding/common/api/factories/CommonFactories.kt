package com.wolfyscript.scaffolding.common.api.factories

import com.wolfyscript.scaffolding.factories.Factories
import com.wolfyscript.scaffolding.factories.IdentifierFactory

class CommonFactories : Factories {

    override val identifierFactory: IdentifierFactory = IdentifierFactoryImpl()

}