import { createSlice } from '@reduxjs/toolkit'

export const modalSlice = createSlice({
    name: 'modal',
    initialState: {
        showModal: false
    },
    reducers: {
        setShowModal: (state, action) => {
            state.showModal = action.payload;
        },
    }
});

// Action creators are generated for each case reducer function
export const { setShowModal } = modalSlice.actions

export default modalSlice.reducer