document.addEventListener("DOMContentLoaded", function() {
    const loginSection = document.querySelector("section");
    loginSection.style.opacity = 0;

    setTimeout(() => {
        loginSection.style.transition = "opacity 1s ease-in-out";
        loginSection.style.opacity = 1;
    }, 500);
});
