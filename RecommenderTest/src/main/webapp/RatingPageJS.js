
let cardContainers = [...document.querySelectorAll(".card-container2")];
let preBtns = [...document.querySelectorAll(".pre-btn")];
let nxtBtns = [...document.querySelectorAll(".nxt-btn")];

cardContainers.forEach((item, i) => {
  let containerDimensions = item.getBoundingClientRect();
  let containerWidth = containerDimensions.width;

  nxtBtns[i].addEventListener("click", () => {
    item.scrollLeft += containerWidth - 450;
  });

  preBtns[i].addEventListener("click", () => {
    item.scrollLeft -= containerWidth + 450;
  });
});

let query2 = document.querySelector('.search-box');
let searchBtn = document.querySelector('.sub-btn');
searchBtn.onclick = function(){
	let url = 'https://www.imdb.com/find/?q='+query2.value;
	window.open(url);
}	