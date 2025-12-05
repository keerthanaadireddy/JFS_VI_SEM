const inventors = {
  james: {
    img: "images/james.jpg",
    text: "James Gosling created Java at Sun Microsystems. Java became one of the most widely used programming languages worldwide, known for portability and enterprise use."
  },
  guido: {
    img: "images/guido.jpg",
    text: "Guido van Rossum invented Python, a language focused on readability, simplicity, and rapid development. It is heavily used in AI, web development, and automation."
  },
  dennis: {
    img: "images/dennis.jpg",
    text: "Dennis Ritchie developed the C programming language and co-created UNIX. C influenced nearly every major programming language in use today."
  },
  bjarne: {
    img: "images/bjarne.jpg",
    text: "Bjarne Stroustrup created C++, combining the efficiency of C with object-oriented programming. It is essential in game engines, system software, and high-performance applications."
  },
  brendan: {
    img: "images/brendan.jpg",
    text: "Brendan Eich invented JavaScript in 1995. It became the standard scripting language for web browsers and now powers modern interactive websites."
  },
  rasmus: {
    img: "images/rasmus.jpg",
    text: "Rasmus Lerdorf created PHP originally for managing his personal website. It later evolved into one of the most widely used server-side languages."
  },
  yukihiro: {
    img: "images/yukihiro.jpg",
    text: "Yukihiro 'Matz' Matsumoto created Ruby, a language designed for developer happiness. Ruby on Rails made it extremely popular for web applications."
  },
  anders: {
    img: "images/anders.jpg",
    text: "Anders Hejlsberg created C#, a modern object-oriented language. He also developed Turbo Pascal and Delphi, making major contributions to software engineering."
  },
  grace: {
    img: "images/grace.jpg",
    text: "Grace Hopper invented COBOL and was a pioneer in early computer programming. She helped create machine-independent programming concepts."
  },
  john: {
    img: "images/john.jpg",
    text: "John McCarthy created Lisp, one of the oldest programming languages still in use. He is considered a founder of artificial intelligence."
  }
};

function showInventor() {
  const key = document.getElementById("inventorSelect").value;
  const photo = document.querySelector(".image-circle img");
  const frame = document.querySelector(".image-circle");
  const desc = document.getElementById("description");

  if (!key) {
    photo.style.display = "none";
    desc.textContent = "Select an inventor to display information.";
    frame.classList.remove("glow-frame");
    frame.style.borderRadius = "50%"; // default circle
    return;
  }

  const data = inventors[key];
  photo.src = data.img;
  photo.style.display = "block";
  desc.textContent = data.text;

  if (key === "james") {
    frame.style.borderRadius = "0%"; // Task 1: square for James
    frame.classList.add("glow-frame"); // Task 2: add glow
  } else {
    frame.style.borderRadius = "50%"; // circle for others
    frame.classList.remove("glow-frame"); // remove glow
  }
}
