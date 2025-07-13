function showCourses() {
    fetch("http://localhost:8080/course")
        .then(response => response.json())
        .then(course => {
            const datatable = document.getElementById("coursetable");
            let rows = '';

            course.forEach(courses => {
                rows += `
                    <tr>
                        <td>${courses.courseId}</td>
                        <td>${courses.courseName}</td>
                        <td>${courses.trainer}</td>
                        <td>${courses.durationInweeks}</td>
                    </tr>
                `;
            });

            datatable.innerHTML = rows;
        })
        .catch(error => {
            console.error("Error fetching courses:", error);
        });
}
function showEnrolledCourses(){
    fetch("http://localhost:8080/course/enrolled")
    .then(response => response.json())
    .then(CourseRegister => {
        const datatable = document.getElementById("enrolledtable");
        let rows= '';

        CourseRegister.forEach(c => {
            rows += `
            <tr>
                <td>${c.name}</td>
                <td>${c.emailId}</td>
                <td>${c.courseName}</td>
            </tr>`;

            datatable.innerHTML = rows;
        })
    })

}