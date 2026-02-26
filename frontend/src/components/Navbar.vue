<template>
  <nav class="fixed w-full bg-[#193938]">
    <div class="flex items-center justify-between py-[10px] px-[10px]">
      <!-- Left side - Burger menu -->
      <div class="flex items-center lg:justify-start lg:p-[5px]">
        <button
          type="button"
          class="text-[#e5d7ae] text-[30px] leading-none"
          aria-label="Open navigation"
        >
          <!-- Simple menu icon -->
          <span class="block w-6 h-0.5 bg-[#e5d7ae] mb-1.5"></span>
          <span class="block w-6 h-0.5 bg-[#e5d7ae] mb-1.5"></span>
          <span class="block w-6 h-0.5 bg-[#e5d7ae]"></span>
        </button>
      </div>

      <!-- Center - Logo and text -->
      <div
        class="flex items-center space-x-3 text-[#e5d7ae] text-[24px] font-semibold absolute left-1/2 transform -translate-x-1/2"
      >
        <img src="@/assets/steamlogo.svg" alt="Steam logo" class="w-[40px] h-[40px]" />
        <p class="text-[24px] text-[#e5d7ae]">ESTIM</p>
      </div>

      <div class="w-6"></div>
    </div>
  </nav>
</template>

<script setup lang="ts"></script>

