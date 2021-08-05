/**
 * Mine JavaScript
 * 鄙人不擅长写JS，部分代码搬运自互联网
 *
 * 这里有很多有的没的
 * 单纯用来美化、装饰、装*
 */
(function(window,document,undefined){

  //配置信息
  //鼠标点击出现爱心
  var SHU_BIAO_DIAN_JI_AI_XIN = true;


  //实现特效
  /**********************************************************/
  /**
   * 鼠标点击出现爱心
   * 搬运自https://blog.csdn.net/qq_41879385/article/details/83472892
   */
  if(SHU_BIAO_DIAN_JI_AI_XIN){
    console.log("加载❤️");
    var hearts = [];
    window.requestAnimationFrame = (function(){
      return window.requestAnimationFrame ||
      window.webkitRequestAnimationFrame ||
      window.mozRequestAnimationFrame ||
      window.oRequestAnimationFrame ||
      window.msRequestAnimationFrame ||
      function (callback){
        setTimeout(callback,1000/60);
      }
    })();
    init();
    function init(){
      css(".heart{width: 10px;height: 10px;position: fixed;background: #f00;transform: rotate(45deg);-webkit-transform: rotate(45deg);-moz-transform: rotate(45deg);}.heart:after,.heart:before{content: '';width: inherit;height: inherit;background: inherit;border-radius: 50%;-webkit-border-radius: 50%;-moz-border-radius: 50%;position: absolute;}.heart:after{top: -5px;}.heart:before{left: -5px;}");
      attachEvent();
      gameloop();
    }
    function gameloop(){
      var offsetY = 10;
      for(var i=0;i<hearts.length;i++){
        if(hearts[i].alpha <=0){
          document.body.removeChild(hearts[i].el);
          hearts.splice(i,1);
          continue;
        }
        hearts[i].y--;
        hearts[i].scale += 0.004;
        hearts[i].alpha -= 0.007;
        hearts[i].el.style.cssText = "left:"+hearts[i].x+"px;top:" + (hearts[i].y - offsetY) + "px;opacity:"+hearts[i].alpha+";transform:scale("+hearts[i].scale+","+hearts[i].scale+") rotate(45deg);background:"+hearts[i].color;
      }
      requestAnimationFrame(gameloop);
    }
    function attachEvent(){
      var old = typeof window.onclick==="function" && window.onclick;
      window.onclick = function(event){
        old && old();
        createHeart(event);
      }
    }
    function createHeart(event){
      var d = document.createElement("div");
      d.className = "heart";
      hearts.push({
        el : d,
        x : event.clientX - 5,
        y : event.clientY - 5,
        scale : 1,
        alpha : 1,
        color : randomColor()
      });
      document.body.appendChild(d);
    }
    function css(css){
      var style = document.createElement("style");
      style.type="text/css";
      try{
        style.appendChild(document.createTextNode(css));
      }catch(ex){
        style.styleSheet.cssText = css;
      }
      document.getElementsByTagName('head')[0].appendChild(style);
    }
    function randomColor(){
      return "rgb("+(~~(Math.random()*255))+","+(~~(Math.random()*255))+","+(~~(Math.random()*255))+")";
    }
    console.log("加载❤️完毕");
  }
  /**********************************************************/
  console.clear();
  console.log("今天又是充满希望的一天");
})(window,document);
