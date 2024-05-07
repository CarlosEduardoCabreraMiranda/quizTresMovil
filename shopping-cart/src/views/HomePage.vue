<template>
  <ion-page>
    <ion-content :fullscreen="true" class="ion-padding">
      <ion-grid>
        <ion-row>
          <ion-col size="12" class="ion-text-center">
            <div>
              <h1 class="ion-text-bold">Ferreteria Alvarito S.A</h1>

              <ion-img style="width: 55%; height: auto; left: 25%; right: 20%; position: relative;"
                src="https://docs-demo.ionic.io/assets/madison.jpg" alt="Ferreteria Alvarito S.A Icono"></ion-img>

              <h4>En esta app podrás mirar nuestros productos, además que podrás realizar compras con nosotros
                ¡Lo mejor en herramienta para tu empresa u hogar! Alvarito S.A, tú mejor opción.</h4>
              <ButtonComponent href="/login" id="login" value="Iniciar sesion" expand="full" color="primary" />
              <ButtonComponent id="bypass_login" value="Entrar directamente" expand="full" color="primary"nameMethod="BypassLogin"  @click="loginwithnodata" />
            </div>
          </ion-col>
        </ion-row>
      </ion-grid>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
import ButtonComponent from '@/components/ButtonComponent.vue';

const user = ref('');
const password = ref('');

const loginwithnodata = () => {
  const username = user.value;
  const pass = password.value;

  if (username === '' && pass === '') {
    window.location.href = "/dashboard";
  } else {
    console.log('Credenciales inválidas');
  }
}
</script>

<style scoped>
#container {
  text-align: center;
  
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  transform: translateY(-50%);
}

#container strong {
  font-size: 20px;
  line-height: 26px;
}

#container p {
  font-size: 16px;
  line-height: 22px;
  
  color: #8c8c8c;
  
  margin: 0;
}

#container a {
  text-decoration: none;
}
</style>
