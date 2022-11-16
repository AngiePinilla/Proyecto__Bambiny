/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const form = document.querySelector("form"),
        nextBtn = form.querySelector(".nextBtn"),
        backBtn = form.querySelector(".backBtn"),
        allInput = form.querySelectorAll(".first input");

nextBtn.addEventListener("click",()=>{
    allInput.forEach(input => {
        if(input.value === ""){
            form.classList.add('secActive');
        }else{
            form.classList.remove('secActive');
        }
    });
});



backBtn.addEventListener("click", () => form.classList.remove('secActive'));


