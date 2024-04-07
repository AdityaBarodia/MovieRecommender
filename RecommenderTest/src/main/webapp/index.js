let movies = [
  {
    name: "falcon and the winter soldier",
    des:
      "Following the events of 'Avengers: Endgame,' Sam Wilson/Falcon and Bucky Barnes/Winter Soldier team up in a global adventure that tests their abilities -- and their patience.",
    image:
      "https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/slider%202.PNG"
  },
  {
    name: "loki",
    des:
      "The mercurial villain Loki resumes his role as the God of Mischief in a new series that takes place after the events of Avengers: Endgame.",
    image:
      "https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/slider%201.PNG"
  },
  {
    name: "wanda vision",
    des:
      "Blends the style of classic sitcoms with the MCU, in which Wanda Maximoff and Vision - two super-powered beings living their ideal suburban lives - begin to suspect that everything is not as it seems.",
    image:
      "https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/slider%203.PNG"
  },
  {
    name: "raya and the last dragon",
    des:
      "In a realm known as Kumandra, a re-imagined Earth inhabited by an ancient civilization, a warrior named Raya is determined to find the last dragon.",
    image:
      "https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/slider%204.PNG"
  },
  {
    name: "luca",
    des:
      "On the Italian Riviera, an unlikely but strong friendship grows between a human being and a sea monster disguised as a human.",
    image:
      "https://raw.githubusercontent.com/AdityaBarodia/MovieRecommender/main/images/slider%205.PNG"
  }
];

const carousel = document.querySelector(".carousel");
let sliders = [];

let slideIndex = 0; // to track current slide index.

const createSlide = () => {
  if (slideIndex >= movies.length) {
    slideIndex = 0;
  }

  // creating DOM element
  let slide = document.createElement("div");
  var imgElement = document.createElement("img");
  let content = document.createElement("div");
  let h1 = document.createElement("h1");
  let p = document.createElement("p");

  // attaching all elements
  imgElement.appendChild(document.createTextNode(""));
  h1.appendChild(document.createTextNode(movies[slideIndex].name));
  p.appendChild(document.createTextNode(movies[slideIndex].des));
  content.appendChild(h1);
  content.appendChild(p);
  slide.appendChild(content);
  slide.appendChild(imgElement);
  carousel.appendChild(slide);

  // setting up image
  imgElement.src = movies[slideIndex].image;
  slideIndex++;

  // setting elements classname
  slide.className = "slider";
  content.className = "slide-content";
  h1.className = "movie-title";
  p.className = "movie-des";

  sliders.push(slide);

  if (sliders.length) {
    sliders[0].style.marginLeft = `calc(-${100 * (sliders.length - 2)}% - ${
      30 * (sliders.length - 2)
    }px)`;
  }
};

for (let i = 0; i < 3; i++) {
  createSlide();
}

setInterval(() => {
  createSlide();
}, 3000);
const videoCards = [...document.querySelectorAll(".video-card")];

videoCards.forEach((item) => {
  item.addEventListener("mouseover", () => {
    let video = item.children[1];
    video.play();
  });
  item.addEventListener("mouseleave", () => {
    let video = item.children[1];
    video.pause();
  });
});
let cardContainers = [...document.querySelectorAll(".card-container")];
let preBtns = [...document.querySelectorAll(".pre-btn")];
let nxtBtns = [...document.querySelectorAll(".nxt-btn")];

cardContainers.forEach((item, i) => {
  let containerDimensions = item.getBoundingClientRect();
  let containerWidth = containerDimensions.width;

  nxtBtns[i].addEventListener("click", () => {
    item.scrollLeft += containerWidth - 200;
  });

  preBtns[i].addEventListener("click", () => {
    item.scrollLeft -= containerWidth + 200;
  });
});

let query = document.querySelector('.search-box');
let searchBtn = document.querySelector('.sub-btn');
searchBtn.onclick = function(){
	let url = 'https://www.imdb.com/find/?q='+query.value;
	window.open(url);
}	

	