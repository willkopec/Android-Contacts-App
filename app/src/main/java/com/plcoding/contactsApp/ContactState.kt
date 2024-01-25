package com.plcoding.contactsApp

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val id: Int = 0,
    val isAddingContact: Boolean = false,
    val isEditingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME,
    val selectedContact: Contact = Contact("","","")
)
