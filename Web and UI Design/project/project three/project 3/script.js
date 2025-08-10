// Student Number: C00305107, Name: Samuel Asuoha

// Change HTML elements with JavaScript
function changeElement() {
    var video = document.getElementById("youTube");

    video.style.paddingLeft = "1000px";
    video.style.textAlign = "center";

   // var containerWidth = window.innerWidth * 0.8;

    //video.style.width = containerWidth + "px";

    //var containerHeight = containerWidth * 9 / 16;

   // video.style.height = containerHeight + "px";
}

//dropdown
function redirectToLink() {
    var dropdown = document.getElementById("instrumentDropdown");
    var selectedOption = dropdown.options[dropdown.selectedIndex];
    var wikipediaLink = selectedOption.value;
    window.open(wikipediaLink, "_blank");
}
// Add event listener to the dropdown menu
document.getElementById("instrumentDropdown").dropdown.addEventListener("change", redirectToLink);

//map
//function initMap() {
  //  var mapOptions = {
    //    center: { lat: 53.349805, lng: -6.26031 }, // Coordinates for Dublin, Ireland
      //  zoom: 7 // Zoom level
    //};
    //var map = new google.maps.Map(document.getElementById("map-container"), mapOptions);

    // Add markers to the map
//    var markers = [
  //      { position: { lat: 53.349805, lng: -6.26031 }, title: "Dublin" }, // Example marker for Dublin
        // Add more markers here
    //];

//    markers.forEach(function(marker) {
 //       new google.maps.Marker({
 //           position: marker.position,
  //          map: map,
  //          title: marker.title
  //      });
  //  });
//}



// If statement
function ContactForm() {
    var form = document.getElementById('contactUs');
  
    form.addEventListener('submit', function(event) {
      event.preventDefault(); // Prevent form submission
  
      // Display confirmation prompt
      var isConfirmed = confirm('Are you sure you want to submit?');
  
      // If user confirms, proceed with form submission
      if (isConfirmed) {
        form.submit(); // Submit the form
      } else {
        // If user cancels, do nothing
        console.log('Submission canceled.');
      }
    });
  }


// onclick event
function submitForm() {
    alert("Form submitted!");
}
// onmouseover event
function showText() {
    document.getElementById("image").style.opacity = "0.5"; // Dim the image
    document.getElementById("text").style.opacity = "1"; // Show the text
}

function hideText() {
    document.getElementById("image").style.opacity = "1"; // Restore the image opacity
    document.getElementById("text").style.opacity = "0"; // Hide the text
}


// Information stored and retrieved from localStorage
function storeData() {
    var data = document.getElementById("dataInput").value;
    localStorage.setItem("userData", data);
}

function retrieveData() {
    var data = localStorage.getItem("userData");
    alert("Stored data: " + data);
}

//call functions
changeElement();

ContactForm();