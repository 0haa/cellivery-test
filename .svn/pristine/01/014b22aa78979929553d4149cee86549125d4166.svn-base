$(document).ready(function() {
	/* hammenu */
	$('.hammenu').click(function(){
		$('.header-left').toggleClass('off')
		$(this).toggleClass('on')
		$('.menu').toggleClass('on')
	})
	
	
	/*var url = window.location.href
	var arrayUrl = url.split('/')
	var temp ="준비중입니다.";
	if(arrayUrl[2]=='celliverylh.com'){
		$('.top_menu_pr').html(' <a href="/notice"  class="lato">PR</a>');
		//$('.top_menu_pr').html('<a onclick="javascript:alert(\''+temp+'\')"  class="lato">PR</a>');
		//$('.top_menu_rd').html('<a onclick="javascript:alert(\''+temp+'\')"  class="lato">R&AMP;D</a>');
		if($('.subpage.real-server').length > 0){
			$('.subpage').hide()
			$('.subpage.real-server').show()
		}
		
	}else{
		$('.top_menu_pr').html(' <a href="/notice"  class="lato">PR</a>');
		//$('.top_menu_rd').html(' <a href="/rnd"  class="lato">R&AMP;D</a>');
		$('.subpage').show()
		$('.subpage.real-server').hide()
	}
	*/
	
//	$(window).resize(function(){
//		if($(window).width() >767){
//			$('.mo-ver').hide()
//			$('.pc-ver').show()
//			
//		}else{
//			$('.pc-ver').hide()
//			$('.mo-ver').show()
//		}
//	}
	
	$(window).scroll(function(){
		var scrTop = $(window).scrollTop();
		if(!$('.menu').hasClass('on')){
			if(scrTop > 100) {
				$('.header').addClass("fixed");
			} else {
				$('.header').removeClass("fixed");
			}
		}
		
		
	})
	
	
	
	$('#fullpage').fullpage({
		//options here
        /*menu: '.maingnb',*/
       /* anchors:['About', 'R&D','Business','Brand','Career'],*/
        autoScrolling:true,
        scrollHorizontally: true,
        navigation:true,
        parallax: true,
        responsiveWidth: 1200,
		/*parallaxKey: 'YWx2YXJvdHJpZ28uY29tXzlNZGNHRnlZV3hzWVhnPTFyRQ==',
		parallaxOptions: {
			type: 'reveal',
			percentage: 62,
			property: 'translate'
		},*/
		afterResponsive: function(isResponsive){
			$(window).scroll(function(){
				if($('.header').offset().top > 0){
					$('.header').css({background:'#fff'})	
					if($(window).width() <1200){
						$('.header').addClass('on')
					}
					
				}else{
					$('.header').css({background:'transparent'})
					if($(window).width() <1200){
						$('.header').removeClass('on')
						
					}
				}
			})
			
	        	   
	        		
	        		
	              	  
			
		},
        afterLoad: function(origin, destination, direction){
          var loadedSection = this;
         /* $('.header .maingnb li a').css({color:'#000'})
          $('.header .maingnb li a').eq(destination.index).css({color:'#9fbee4'})*/
          
      	if(destination.index == 0){
      	   /*$('.section').find('.txtEffect').removeClass('on')*/
      		$('.main .section01 .slick-active').find('.txtEffect').addClass('on')
          }else if(destination.index == 5){
        	  $('.section05').find('.txtEffect').addClass('on')
          }else{
          $('.section').not('.section01').find('.txtEffect').removeClass('on')
          $('.section.active').find('.txtEffect').addClass('on')
        }
          //using index
          if(destination.index == 0){
        	  $('.header .maingnb li a').css({color:'#000'})
          }else if(destination.index == 1){
        	  $('.header .maingnb li a').css({color:'#000'})
          }else if(destination.index == 2){
        	  $('.header .maingnb li a').css({color:'#000'})
          }else if(destination.index == 3){
        	  if($(window).width() > 1200){
        	  $('.header .maingnb li a').css({color:'#fff'})
        	/*  $('.header .maingnb li').eq(0).find('a').css({color:'#000'})
        	  $('.header .maingnb li').eq(1).find('a').css({color:'#000'})*/
        	  /*$('.header .maingnb li a').eq(destination.index).css({color:'#9fbee4'})*/
        	  }
          }else if(destination.index == 4){
        	  $('.header .maingnb li a').css({color:'#000'})
          }else if(destination.index == 5){       
        	   $('.header .maingnb li a').css({color:'#000'})
          }

          
          if(destination.index == 3){
            $('.down-scroll').css({
              borderColor:'#fff'
            })
          }else{
            $('.down-scroll').css({
            	 borderColor:'rgba(0,0,0,0.5)'
            })            
          }
          if(destination.index == 2){
        	  $('.main .section03').addClass('on')
          }else{
        	  $('.main .section03').removeClass('on')
          }
          if(destination.index == 3){
            $('#fp-nav.fp-right').css({
              backgroundColor:'#1f232d'
            })
            $('.hammenu.pc-ver').addClass('on')
            $('#fp-nav ul li a span').css({
              backgroundColor:'#fff'
            })
            $('.down-scroll').addClass('white')
            $('.down-scroll img.pc-ver').attr('src','img/down-w.png')
           
          }else{
            $('#fp-nav.fp-right').css({
              backgroundColor:'transparent'
            })
            $('.hammenu.pc-ver').removeClass('on')
            $('#fp-nav ul li a span').css({
              backgroundColor:'#262f40'
            })
            $('.down-scroll').removeClass('white')
            if($(window).width() < 767){
            	$('.down-scroll img.mo-ver').attr('src','img/down.png')	
            }else{
            	$('.down-scroll img.pc-ver').attr('src','img/down.png')
            }
            
            
          }
         
          if(destination.index == 4){
        	  $('.down-scroll').addClass('last')
        	  $('.main .section03').addClass('on')
        	  if($(window).width() > 1200){
        	    $('.down-scroll.pc-ver').click(function(){
        	    	 fullpage_api.moveTo(1);
        		})
        	  }
          }else{
        	  if($(window).width() > 1200){
        	  $('.down-scroll.pc-ver').click(function(){   
        		  fullpage_api.moveTo(destination.index+2);
        		})
        	  }else{
        		  $('.down-scroll.mo-ver').click(function(){   
            		  fullpage_api.moveTo(2);
            		})
        	  }
        	  $('.down-scroll').removeClass('last')
          }
          if(destination.index != 5){        	  
        	 
        		 $('.down-scroll').show()
        		 $('#fp-nav.fp-right').css({zIndex:'100'})
          }else{        	
        	
        	  $('.down-scroll').hide()
        	  $('#fp-nav.fp-right').css({zIndex:'-1'})
          }
        },
        onLeave: function(origin, destination, direction){
    		var leavingSection = this;

    		//after leaving section 2
    		if(direction =='down'){
    			$(".section").find(".fp-bg").removeClass('active')	
    			if(destination.index==1){
    				$(".section02").find(".fp-bg").addClass('active')	
    			}else if(destination.index==2){
    				$(".section03").find(".fp-bg").addClass('active')	
    			}else if(destination.index==3){
    				$(".section04").find(".fp-bg").addClass('active')	
    			}else if(destination.index==4){
    				$(".section05").find(".fp-bg").addClass('active')	
    			}else if(destination.index==5){
    				$(".section05").find(".fp-bg").addClass('active')	
    			}
    			
    		}
    		else if(direction == 'up'){
    			$(".section").find(".fp-bg").removeClass('active')
    			if(destination.index==1){    				
    				$(".section02").find(".fp-bg").addClass('active')	
    			}else if(destination.index==2){
    				$(".section03").find(".fp-bg").addClass('active')	
    			}else if(destination.index==3){
    				$(".section04").find(".fp-bg").addClass('active')	
    			}else if(destination.index==4){
    				$(".section05").find(".fp-bg").addClass('active')	
    			}
    		}
    	}
	});
	/*function down(){
		   $.fn.fullpage.moveTo(section);
	}
	function up(){
		fullpage_api.moveSectionUp();
	}*/
/*	$('.header .maingnb li').click(function(e){
		
  	  var secNo = $(this).index()+1
  	  console.log(secNo)
  
	  	if(secNo == 5){	  		
	  		var url = window.location.href
	  		var arrayUrl = url.split('/')
	  		
	  		if(arrayUrl[2]=='celliverylh.com'){
	  			e.preventDefault();
//		  		alert('준비중입니다')
	  		}else{
	  			
	  		}
	  		
	  	}else{
//	  		fullpage_api.moveTo(secNo);
//	  	  	$(".section").eq(secNo).find(".fp-bg").addClass('active')	
	  	}
    })*/

	 var time =6;
     var $bar = $('.main .section01 .slider-nav li .back'),
         $slick =  $('.sec01-slide-wrap'),
         isPause,
         tick,
         percentTime;
	
     $slick.slick({
    	 fade:true,
        slidesToShow: 1,
        slidesToScroll: 1,
        autoplay: false,
        autoplaySpeed: 5000,
        focusOnSelect: true,
        speed:1000,
        arrows:true,
        prevArrow : "<button type='button' class='slick-prev'><img src='img/arrow-left.png' alt='셀리버리L&H'></button>",		// 이전 화살표 모양 설정
        nextArrow : "<button type='button' class='slick-next'><img src='img/arrow-right.png' alt='셀리버리L&H'></button>",		// 다음 화살표 모양 설정
        asNavFor: '.slider-nav',       
        dots:true
      });
      $('.slider-nav').slick({
        slidesToShow: 3,
        slidesToScroll: 1,
        arrows:false,
        dots: false,       
        focusOnSelect: true,
      infinite: false,
        
      });
      $('.main .section01 .slick-active').find('.txtEffect').addClass('on')
      $slick.on('afterChange', function(event, slick, currentSlide, nextSlide){
    	  $('.main .section01 .slick-slide').find('.txtEffect').removeClass('on')
          $('.main .section01 .slick-active').find('.txtEffect').addClass('on')
    	});
      $('.slider-nav li').click(function(){
    	  var slideNo = $(this).index()
    	  $slick.slick('slickGoTo', slideNo);
    	  startProgressbar();
      })
     $('.slick-arrow').click(function(){
    	 startProgressbar();
     })
      function startProgressbar() {
    	    resetProgressbar();
    	    percentTime = 0;
    	    isPause = false;
    	    tick = setInterval(interval, 10);
    	  }
    	  
    	  function interval() {
    	    if(isPause === false) {
    	      percentTime += 1 / (time+0.1);
    	      $bar.css({
    	        width: percentTime+"%"
    	      });
    	      if(percentTime >= 100)
    	        {
    	          $slick.slick('slickNext');
    	          startProgressbar();
    	        }
    	    }
    	  }
    	  
    	  
    	  function resetProgressbar() {
    	    $bar.css({
    	     width: 0+'%' 
    	    });
    	    clearTimeout(tick);
    	  }
    	  
  	  startProgressbar();
      // main section04
  	  
  	  if($(window).width() > 767){
  		
  	    
  		$(".business-box li").each(function(){			
  			$(this).mousemove(function( e ) {
  			   var x = e.clientX;
  			   var y = e.clientY;

  			   var relativeXPosition = (e.clientX - this.offsetLeft); 
  		        var relativeYPosition = (e.clientY - this.offsetTop);

  		        $(this).find( ".shadow-box" ).css({"top":relativeYPosition+"px", "left":relativeXPosition+"px"});
  		        $( ".shadow-box" ).hide()
  		        $(this).find( ".shadow-box" ).show()
  			  
  			}).mouseleave(function(){
  				$( ".shadow-box" ).hide()
  			});					
  			
  		});
  	    
  	  }
    

    

    
    
    
    //
  	
  	  
  	  
    $(window).resize(function(){
    	 if($(window).width() > 767){ 
        	
        	
    	 }else{
    		 $('.down-scroll.mo-ver').click(function(){
        		 fullpage_api.moveTo(2);
        	})
    	 }
    	
    	
    })
    	
    
    $(".family").click(function(){
    	if($(".family").find('ul').css('display')=='block'){
    		$(this).find('ul').hide()	
    		$(this).find('img').removeClass('rotate')
        }else{
        	$(this).find('ul').show()
        	$(this).find('img').addClass('rotate')
        }
    	
    	
    })
    
    
    $('.hammenu img').click(function(){
    	alert('준비중입니다')
    })
    
});



$(document).ready(function(){

//	$(".pop-up").show();
	var layer = $('.pop-up-contents');
	var btnDayClose = $('.close-day-btn');
	var btnClose = $('.pop-up .close-btn');
	var edate= new Date("2030/11/27 08:00:00"); 
	
	//닫기버튼 누를시 하루동안 열지않기
	cookiedata = document.cookie;
		if ( Date.now() <= edate && cookiedata.indexOf("layerCookie=done") < 0 ){ 
			$('.pop-up').show();
		}
		else {
			$('.pop-up').hide();
		}

	function setCookie( name, value, expiredays ) {
		var todayDate = new Date();
		todayDate.setDate( todayDate.getDate() + expiredays ); 
		document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";"
	}
	btnDayClose.on("click", function(){
	//expiredays의 1은 하루를 의미한다, 일주일은 7, 1년은 365로 입력
		setCookie( "layerCookie", "done" , 1);
		$(this).parents('.pop-up-contents').fadeOut('fast');
		$(this).parents('.pop-up-contents').removeClass('show')
		console.log($('.pop-up-contents.show').length )
		
		if($('.pop-up-contents.show').length == '0'){
			$('.pop-up').hide()
		}
	})
	btnClose.on("click", function(){
		$(this).parents('.pop-up-contents').hide()
		$(this).parents('.pop-up-contents').removeClass('show')
		console.log($('.pop-up-contents.show').length )
		
		if($('.pop-up-contents.show').length == '0'){
			$('.pop-up').hide()
		}
	})

	});


