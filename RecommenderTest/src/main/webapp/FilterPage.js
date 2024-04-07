

let cardContainers = [...document.querySelectorAll(".genre-container")];
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

const range = document.querySelectorAll('.MINrange-slider input');
progress = document.querySelector('.MINrange-slider .MINprogress');
let gap = 50;
const inputValue = document.querySelectorAll('.numberVal input');


range.forEach(input => {
  input.addEventListener('input', e => {
    let minrange = parseInt(range[0].value),
        maxrange = parseInt(range[1].value);
        
        if(maxrange - minrange < gap){
           if(e.target.className === "MINrange-min"){
               range[0].value = maxrange - gap;
           }
           else{
              range[1].value = minrange + gap;
           }
        }
        else{
          //progress.style.left = (minrange / range[0].max) * 100 +'%';
          //progress.style.right = 100-(maxrange / range[1].max) * 100 +'%';
          inputValue[0].value = minrange;
          inputValue[1].value = maxrange;
        }
  })
})


const range2 = document.querySelectorAll('.YRrange-slider input');
progress2 = document.querySelector('.YRrange-slider .YRprogress');
let gap2 = 10;
const inputValue2 = document.querySelectorAll('.numberVal2 input');


range2.forEach(input => {
  input.addEventListener('input', e => {
    let minrange2 = parseInt(range2[0].value),
        maxrange2 = parseInt(range2[1].value);
        
        if(maxrange2 - minrange2 < gap2){
           if(e.target.className === "YRrange-min"){
               range2[0].value = maxrange2 - gap2;
           }
           else{
              range2[1].value = minrange2 + gap2;
           }
        }
        else{
          //progress2.style.left = (minrange2 / range2[0].max) * 100 +'%';
          //progress2.style.right = 100-(maxrange2 / range2[1].max) * 100 +'%';
          inputValue2[0].value = minrange2;
          inputValue2[1].value = maxrange2;
        }
  })
})



let query2 = document.querySelector('.search-box');
let searchBtn = document.querySelector('.sub-btn');
searchBtn.onclick = function(){
	let url = 'https://www.imdb.com/find/?q='+query2.value;
	window.open(url);
}