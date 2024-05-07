<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Dashboard</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content>
      <br>
      <div id="container">
        <strong>
          <ButtonComponent href="/cliente" value="Ir a Cliente" id="clientesBtn" />
        </strong>
        <br>

        <strong>
          <ButtonComponent href="/producto" value="Ir a Producto" id="productosBtn" />
        </strong>

        <strong>
          <ButtonComponent href="/proveedor" value="Ir a Proveedor" id="proveedorBtn" />
        </strong>
      </div>

    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
import ButtonComponent from '@/components/ButtonComponent.vue';
</script>

<style scoped></style>
