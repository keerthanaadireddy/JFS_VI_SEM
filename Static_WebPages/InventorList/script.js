const inventors = {
  james: {
    img: "images/james.jpg",
    text: "James Gosling created Java at Sun Microsystems. Java became one of the most widely used programming languages worldwide."
  },
  guido: {
    img: "images/guido.jpg",
    text: "Guido van Rossum invented Python, known for its simplicity and readability."
  },
  dennis: {
    img: "images/dennis.jpg",
    text: "Dennis Ritchie developed the C programming language and co-created UNIX."
  },
  bjarne: {
    img: "images/bjarne.jpg",
    text: "Bjarne Stroustrup created C++, adding object-oriented programming to C."
  },
  brendan: {
    img: "images/brendan.jpg",
    text: "Brendan Eich invented JavaScript, the language of the web."
  },
  rasmus: {
    img: "images/rasmus.jpg",
    text: "Rasmus Lerdorf created PHP, used widely for server-side scripting."
  },
  yukihiro: {
    img: "images/yukihiro.jpg",
    text: "Yukihiro Matsumoto invented Ruby, focusing on developer happiness."
  },
  anders: {
    img: "images/anders.jpg",
    text: "Anders Hejlsberg created C# and previously developed Turbo Pascal."
  },
  grace: {
    img: "images/grace.jpg",
    text: "Grace Hopper developed COBOL and pioneered computer programming."
  },
  john: {
    img: "images/john.jpg",
    text: "John McCarthy created Lisp and is considered a founder of AI."
  }
};

function showInventor() {
  const key = document.getElementById("inventorSelect").value;
  const photo = document.getElementById("photo");
  const description = document.getElementById("description");

  if (!key) {
    photo.style.display = "none";
    description.textContent = "Select an inventor to display information.";
    return;
  }

  const info = inventors[key];
  photo.src = info.img;
  photo.style.display = "block";
  description.textContent = info.text;

  // Task 1. only james has a square frame and the rest have circle frames
  if (key === "james") {
    frame.style.borderRadius = "0";  // this displays in square
  } else {
    frame.style.borderRadius = "50%"; // this displays in circle
  }
}
