
document.getElementById("login-form").addEventListener("submit", function (e) {
    e.preventDefault();

    // Get the selected user type
    const userType = document.querySelector('select[name="user-type"]').value;

    // Redirect based on user type
    if (userType === 'Businesses Head') {
        window.location.href = "admin-panel.html"; // Redirect to the admin dashboard page
    } else if (userType === 'Project team') {
        window.location.href = "developer_dashboard.html"; // Redirect to the developer dashboard page
    }
});