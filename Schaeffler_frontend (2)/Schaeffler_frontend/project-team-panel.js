const statusLights = document.querySelectorAll('.status-light');

statusLights.forEach(light => {
    light.addEventListener('click', () => {
        statusLights.forEach(otherLight => {
            otherLight.classList.remove('selected');
        });
        light.classList.add('selected');
    });
});
document.addEventListener('DOMContentLoaded', function () {
    // Add click event listeners to all status lights
    const statusLights = document.querySelectorAll('.status-light');
    
    statusLights.forEach(light => {
        light.addEventListener('click', function () {
            // Remove 'selected' class from all lights in the same column
            const column = this.parentElement;
            const lightsInColumn = column.getElementsByClassName('status-light');
            for (const light of lightsInColumn) {
                light.classList.remove('selected');
            }
            
            // Add 'selected' class to the clicked light
            this.classList.add('selected');
        });
    });
});
function changeColor(input, color) {
    const statusLights = document.getElementsByClassName("status-light");
    for (const light of statusLights) {
        light.style.backgroundColor = "";
    }
    document.getElementById(color).style.backgroundColor = input.value;
}
// Function to toggle the "selected" class when a circle is clicked
function toggleSelected(element) {
    element.classList.toggle("selected");
}

// Attach the click event to each status circle
document.querySelectorAll('.status-light').forEach(circle => {
    circle.addEventListener('click', function() {
        toggleSelected(this);
    });
});

