import { createSlice } from '@reduxjs/toolkit'

export const projectsSlice = createSlice({
    name: 'projects',
    initialState: {
        hasEnteredVP: false,
        hasLeftVP: false,
    },
    reducers: {
        setHasEntered: (state, action) => {
            state.hasEnteredVP = action.payload
        },
        setHasLeft: (state, action) => {
            state.hasLeftVP = action.payload
        },
    },
})

// Action creators are generated for each case reducer function
export const { setHasEntered, setHasLeft } = projectsSlice.actions

export default projectsSlice.reducer