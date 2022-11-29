<h1 style="text-align:center">System Analysis : Docker</h1>

<img src="https://www.docker.com/wp-content/uploads/2022/03/vertical-logo-monochromatic.png" alt="Docker" class="center" style="width:50%; display: block;margin-left: auto;margin-right: auto;">

<div style"text-align:center">
<p style"text-align:center">Author : Pramudya Arya Wicaksana<p>
<p style"text-align:center">NIM : 2242805</p>
<p style"text-align:center">Course : Software Engineering</p>
</div>

## Docker overview  

Docker adalah aplikasi open source yang diperuntukan _developing_, _shipping_, dan _running_ sebuah atau lebih dari satu aplikasi, Docker berguna untuk memisahkan aplikasi dari _single infrastructure_ yang dapat mempercepat _delivery_ aplikasi, dengan Docker, bisa mengatur infrastruktur sistem sesuai kebutuhan aplikasi tanpa harus mengubah infrastruktur _local development_ sehingga mempermudah proses _development_ sebuah aplikasi

## Docker infrastructure 

Docker merupakan aplikasi dengan skema _Container_ yang berguna untuk mengisolasi aplikasi yang akan di deploy, Dengan begitu aplikasi satu dengan aplikasi yang lainnya tidak akan bersinggungan kecuali jika Docker network diatur sedemikian mungkin

<img src="https://docs.docker.com/engine/images/architecture.svg" alt="Docker" class="center" style="display: block;margin-left: auto;margin-right: auto;">


## Docker usecases

Docker digunakan untuk memisahkan aplikasi, seperti contoh memisahkan aplikasi _Worker_ dan _Runnner_ di Container berbeda

<img src="https://www.filepicker.io/api/file/Dqy8g16LQ5G5mEA9m2fK" alt="Docker" class="center" style="display: block;margin-left: auto;margin-right: auto;">

 ## Container vs VMs
 
 Docker menggunakan skema aplikasi Container, Container bekerja mirip seperti _Virtual Machine_ namun dengan cara kerja lebih ringan dan cepat, serta ideal untuk automasi DevOps pipeline termasuk _Continuous Integration_ dan _Continuous Deployment_ (CI/CD)
 
 ## Conclusion
 
 Dengan ini pengerjaan aplikasi serta pengiriman aplikasi kepada user akan semakin mudah dengan adanya sistem Docker serta CI/CD, Docker ini termasuk kedalam aplikasi **_Systems for modeling and simulation_** karena bekerja untuk mensimulasikan aplikasi di dalam Container yang terisolasi