import { FormBuilder } from "@angular/forms";
import { LoginPageForm } from "./login.page.form";

describe('LoginPageForm', () =>{
    it('should create login form empty', () =>{
        const loginPageForm = new LoginPageForm(new FormBuilder());
        const form = loginPageForm.createForm()
        const email = form.get('email')
        const password = form.get('password')
        expect(form).not.toBeNull();
        expect(email).not.toBeNull();
        expect(email.value).toEqual("");
        expect(password).not.toBeNull();
    }
        
    )
})