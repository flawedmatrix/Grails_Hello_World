class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller: "inputHandler", action: "handle")
		"500"(view:'/error')
	}
}
