package maildemo

class UtilController {

    def mailService

    def index() {
    	println "Sending mail....."
        mailService.sendMail {
            to "puneet.behl@intelligrape.com"
            from "adityat@intelligrape.com"
            subject "Hello!!!"
            text "This is sample message"
        }
        render 'Ok'
    }
}
