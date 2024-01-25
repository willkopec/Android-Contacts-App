package com.plcoding.contactsApp

sealed interface ContactEvent {
    object SaveContact: ContactEvent
    data class SetFirstName(val firstName: String): ContactEvent
    data class SetLastName(val lastName: String): ContactEvent
    data class SetPhoneNumber(val phoneNumber: String): ContactEvent
    data class SetId(val id: Int): ContactEvent
    object ShowDialog: ContactEvent
    object UpdateContact: ContactEvent
    object HideDialog: ContactEvent
    data class SortContacts(val sortType: SortType): ContactEvent
    data class DeleteContact(val contact: Contact): ContactEvent
    data class EditContact(val contact: Contact): ContactEvent
}