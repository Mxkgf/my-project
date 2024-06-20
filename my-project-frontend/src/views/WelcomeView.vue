<script setup>

</script>

<template>
    <div style="width: 100vw; height: 100vh; overflow: hidden; display: flex;">
        <div style="flex: 1; background-color: black;">
          <el-image fit="cover" style="width: 100%; height: 100%;" src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"/>
        </div>
        <div class="right-card">
          <div>
            <router-view/>
          </div>
        </div>
    </div>
</template>

<style scoped>
    .right-card {
        width: 400px;
        z-index: 1;
        background-color: white;
    }
</style>