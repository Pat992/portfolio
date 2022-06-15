import { createSlice } from '@reduxjs/toolkit'

export const themeSlice = createSlice({
    name: 'theme',
    initialState: {
        isDarkTheme: window.matchMedia("(prefers-color-scheme: dark)").matches,
    },
    reducers: {
        setIsDarkTheme: (state, action) => {
            state.isDarkTheme = action.payload
        },
    },
})

// Action creators are generated for each case reducer function
export const { setIsDarkTheme } = themeSlice.actions

export default themeSlice.reducer