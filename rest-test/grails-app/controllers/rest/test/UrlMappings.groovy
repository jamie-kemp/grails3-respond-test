package rest.test

class UrlMappings {

    static mappings = {
		"/test"(resource:'test')
        //"/$controller/$action?/$id?(.$format)?"{
        //    constraints {
        //        // apply constraints here
        //    }
        //}
		
		

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
