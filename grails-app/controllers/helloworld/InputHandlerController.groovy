package helloworld

class InputHandlerController {

    static allowedMethods = [handle:['POST', 'GET']]

    def handle() {
        def map = [text: "Hello, World"]
        if (request.method == 'POST') {
            log.info request
            map.text = params.inputText
        }
        render(view: "/index", model: map)
    }
}
