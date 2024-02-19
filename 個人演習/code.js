let name1 = document.getElementById('name1')
let name2 = document.getElementById('name2')
let email = document.getElementById('email')
let country = document.getElementById('country')

let editRowIndex = null;

function editRow(button) {
    let row = button.parentNode.parentNode;
    let name1s = row.cells[0].innerHTML;
    let name2s = row.cells[1].innerHTML;
    let emails = row.cells[2].innerHTML;
    let countrys = row.cells[5].innerHTML;
    name1.value = name1s.trim();
    name2.value = name2s.trim();
    email.value = emails.trim();
    country.value = countrys.trim();

    editRowIndex = row.rowIndex;
}

function submitForm() {
    if (name1.value.trim() === '') {
        alert('エラー');
        return;
    }
    if (name2.value.trim() === '') {
        alert('エラー');
        return;
    }

    if (email.value.trim() === '') {
        alert('エラー');
        return;
    }
    if (country.value.trim() === '') {
        alert('エラー');
        return;
    }

}
