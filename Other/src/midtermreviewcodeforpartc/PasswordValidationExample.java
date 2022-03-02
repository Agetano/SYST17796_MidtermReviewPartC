
package midtermreviewcodeforpartc;


public class PasswordValidationExample {
    /** Javascript validate password
    let pattern = new RegExp("^(?=(.*[a-zA-Z]){1,})(?=(.*[0-9]){2,}).{8,}$"); //Regex: At least 8 characters with at least 2 numericals
    let inputToListen = document.getElementById('pass-one'); // Get Input where psw is write
    let valide = document.getElementsByClassName('indicator')[0]; //little indicator of validity of psw

    inputToListen.addEventListener('input', function () { // Add event listener on input
        if(pattern.test(inputToListen.value)){
            valide.innerHTML = 'ok';
        }else{
            valide.innerHTML = 'not ok'
        }
    });
    
    password validation with regular expression in javascript
    var strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
    
    password validation
    new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9_])")
}
}


