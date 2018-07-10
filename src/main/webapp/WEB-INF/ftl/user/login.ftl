<!DOCTYPE html>
<html >
<head>
<meta charset="UTF-8">
<title>Sign Up Login</title>
<link rel="stylesheet" href="localhost:8080/shiroDemo/css/style.css">
</head>

<body>

<div class="cotn_principal">
  <div class="cont_centrar">
    <div class="cont_login">
      <div class="cont_info_log_sign_up">
        <div class="col_md_login">
          <div class="cont_ba_opcitiy">
            <h2>LOGIN</h2>
            <p>Lorem ipsum dolor sit amet, consectetur.</p>
            <button class="btn_login" onClick="cambiar_login()">LOGIN</button>
          </div>
        </div>
        <div class="col_md_sign_up">
          <div class="cont_ba_opcitiy">
            <h2>SIGN UP</h2>
            <p>Lorem ipsum dolor sit amet, consectetur.</p>
            <button class="btn_sign_up" onClick="cambiar_sign_up()">SIGN UP</button>
          </div>
        </div>
      </div>
      <div class="cont_back_info">
        <div class="cont_img_back_grey"> <img src="po.jpg" alt="" /> </div>
      </div>
      <div class="cont_forms" >
        <div class="cont_img_back_"> <img src="po.jpg" alt="" /> </div>
        <div class="cont_form_login"> <a href="#" onClick="ocultar_login_sign_up()" ><i class="material-icons">&#xE5C4;</i></a>
          <h2>LOGIN</h2>
          <input type="text" placeholder="Email" />
          <input type="password" placeholder="Password" />
          <button class="btn_login" onClick="cambiar_login()">LOGIN</button>
        </div>
        <div class="cont_form_sign_up"> <a href="#" onClick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
          <h2>SIGN UP</h2>
          <input type="text" placeholder="Email" />
          <input type="text" placeholder="User" />
          <input type="password" placeholder="Password" />
          <input type="password" placeholder="Confirm Password" />
          <button class="btn_sign_up" onClick="cambiar_sign_up()">SIGN UP</button>
        </div>
      </div>
    </div>
  </div>
</div>

<script src="localhost:8080/shiroDemo/js/index.js"></script>
<div style="text-align:center;">
</div>
</body>
</html>
