<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="Home.css">
    <link href="bootstrap/css/bootstrap.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <title>Home</title>
    <script>
    var i = 0;
    $(document).ready(function() {
      $("#sliderImage" + i).hide();
      showNextImage();
      setInterval(showNextImage, 3000);
    });

    function showNextImage() {
      $("#sliderImage" + i).appendTo('#slider').fadeIn(1000).delay(1000).fadeOut(1000);
      i++;
      if (i == 3) i = 0;
      $("#sliderTitle" + i).appendTo('#slider').fadeIn(1000).delay(1000).fadeOut(1000);
    }
  </script>
</head>
<header>
    <h1>UTS Hotel</h1>
    <nav>
        <ul>
            <li><a href="Home.php">Home</a></li>
            <li><a href="CekHarga.php">Cek Harga</a></li>
            <li><a href="Login.php">Logout</a></li>
        </ul>
    </nav>
</header>
<body>
    <!-- Slider Section -->
    <div id="slider">
        <img id="sliderImage1" src="Gambar/Slide1.jpg" alt="Slider Image 1">
        <div class="slidertitle" id="title1">Gambar 1</div>
        <img id="sliderImage2" src="Gambar/Slide2.jpg" alt="Slider Image 2">
        <div class="slidertitle" id="title2">Gambar 2</div>
        <img id="sliderImage3" src="Gambar/Slide3.jpg" alt="Slider Image 3">
        <div class="slidertitle" id="title3">Gambar 3</div>
    </div>
     <section class="profile-section">
        <div class="profile-container">
            <h2 class="profile-title">Selamat Datang di UTS Hotel</h2>
            <p class="profile-description">
                UTS Hotel adalah hotel bintang lima yang terletak di jantung kota, menawarkan kenyamanan modern dengan sentuhan tradisional. Kami menyediakan berbagai fasilitas untuk memenuhi kebutuhan Anda, mulai dari kamar mewah, restoran berkelas, hingga ruang pertemuan dan spa. Pelayanan kami yang ramah dan profesional siap memberikan pengalaman menginap yang tak terlupakan.
            </p>
            <p class="profile-description">
                Nikmati keindahan pemandangan kota dan kenyamanan tertinggi bersama kami. Kami berkomitmen untuk memberikan pelayanan terbaik bagi setiap tamu yang datang. UTS Hotel, tempat terbaik untuk Anda beristirahat dan menikmati liburan atau keperluan bisnis.
            </p>
            <p class="profile-description">
                UTS Hotel ini didirikan sejak 23 Oktober 2024 oleh Luthfi Triaswangga
            </p>
        </div>
    </section>
    <footer>
            <h3>Luthfi Triaswangga</h3>
            <p>&copy; 2341720208 - TI 2E / 18</p>
        </div>
    </footer>
</body>
</html>
